package com.itquasar.multiverse.jmacro.core.exception;


import lombok.Getter;

/**
 *
 EXIT CODES ON BASH ================================================================================
 (source: ftp://ftp.wayne.edu/ldp/en/abs-guide/ape.html)

 Appendix E. Exit Codes With Special Meanings

 Table E.1. Reserved Exit Codes

 Exit Code Number	Meaning	Example	Comments
 1	Catchall for general errors	let "var1 = 1/0"	Miscellaneous errors, such as “divide by zero” and other impermissible operations
 2	Misuse of shell builtins (according to Bash documentation)	empty_function() {}	Missing keyword or command, or permission problem (and diff return code on a failed binary file comparison).
 126	Command invoked cannot execute	/dev/null	Permission problem or command is not an executable
 127	“command not found”	illegal_command	Possible problem with $PATH or a typo
 128	Invalid argument to exit	exit 3.14159	exit takes only integer args in the range 0 - 255 (see first footnote)
 128+n	Fatal error signal “n”	kill -9 $PPID of script	$? returns 137 (128 + 9)
 130	Script terminated by Control-C	Ctl-C	Control-C is fatal error signal 2, (130 = 128 + 2, see above)
 255*	Exit status out of range	exit -1	exit takes only integer args in the range 0 - 255

 According to the above table, exit codes 1 - 2, 126 - 165, and 255 [144] have special meanings, and should therefore be avoided for user-specified exit parameters. Ending a script with exit 127 would certainly cause confusion when troubleshooting (is the error code a “command not found” or a user-defined one?). However, many scripts use an exit 1 as a general bailout-upon-error. Since exit code 1 signifies so many possible errors, it is not particularly useful in debugging.


 There has been an attempt to systematize exit status numbers (see /usr/include/sysexits.h), but this is intended for C and C++ programmers. A similar standard for scripting might be appropriate. The author of this document proposes restricting user-defined exit codes to the range 64 - 113 (in addition to 0, for success), to conform with the C/C++ standard. This would allot 50 valid codes, and make troubleshooting scripts more straightforward. [145] All user-defined exit codes in the accompanying examples to this document conform to this standard, except where overriding circumstances exist, as in Example 9.2, “Timed Input”.

 Note
 Issuing a $? from the command-line after a shell script exits gives results consistent with the table above only from the Bash or sh prompt. Running the C-shell or tcsh may give different values in some cases.


 [144] Out of range exit values can result in unexpected exit codes. An exit value greater than 255 returns an exit code modulo 256. For example, exit 3809 gives an exit code of 225 (3809 % 256 = 225).

 [145] An update of /usr/include/sysexits.h allocates previously unused exit codes from 64 - 78. It may be anticipated that the range of unallotted exit codes will be further restricted in the future. The author of this document will not do fixups on the scripting examples to conform to the changing standard. This should not cause any problems, since there is no overlap or conflict in usage of exit codes between compiled C/C++ binaries and shell scripts.

 EXIT CODES ON BSD/UNIX (sysexits.h) ===============================================================
 (source: https://man.freebsd.org/cgi/man.cgi?sektion=3&query=sysexits)

 SYSEXITS(3)	       FreeBSD Library Functions Manual		   SYSEXITS(3)

 NAME
 sysexits -- preferable exit codes for programs

 SYNOPSIS
 #include <sysexits.h>

 DESCRIPTION
 According to style(9), it is not a	good practice to call exit(3) with ar-
 bitrary values to indicate	a failure condition when ending	a program.
 Instead, the pre-defined exit codes from sysexits should be used, so the
 caller of the process can get a rough estimation about the	failure	class
 without looking up	the source code.

 The successful exit is always indicated by	a status of 0, or EX_OK.  Er-
 ror numbers begin at EX__BASE to reduce the possibility of	clashing with
 other exit	statuses that random programs may already return.  The meaning
 of	the codes is approximately as follows:

 EX_USAGE (64)	   The command was used	incorrectly, e.g., with	the
 wrong number	of arguments, a	bad flag, a bad	syntax
 in a	parameter, or whatever.

 EX_DATAERR	(65)	   The input data was incorrect	in some	way.  This
 should only be used for user's data and not system
 files.

 EX_NOINPUT	(66)	   An input file (not a	system file) did not exist or
 was not readable.  This could also include errors
 like	"No message" to	a mailer (if it	cared to catch
 it).

 EX_NOUSER (67)	   The user specified did not exist.  This might be
 used	for mail addresses or remote logins.

 EX_NOHOST (68)	   The host specified did not exist.  This is used in
 mail	addresses or network requests.

 EX_UNAVAILABLE (69)   A service is	unavailable.  This can occur if	a sup-
 port	program	or file	does not exist.	 This can also
 be used as a	catchall message when something	you
 wanted to do	does not work, but you do not know
 why.

 EX_SOFTWARE (70)	   An internal software	error has been detected.  This
 should be limited to	non-operating system related
 errors as possible.

 EX_OSERR (71)	   An operating	system error has been detected.	 This
 is intended to be used for such things as "cannot
 fork", "cannot create pipe",	or the like.  It in-
 cludes things like getuid returning a user that
 does	not exist in the passwd	file.

 EX_OSFILE (72)	   Some	system file (e.g., /etc/passwd,
 /var/run/utx.active,	etc.) does not exist, cannot
 be opened, or has some sort of error	(e.g., syntax
 error).

 EX_CANTCREAT (73)	   A (user specified) output file cannot be created.

 EX_IOERR (74)	   An error occurred while doing I/O on	some file.

 EX_TEMPFAIL (75)	   Temporary failure, indicating something that	is not
 really an error.  In	sendmail, this means that a
 mailer (e.g.) could not create a connection,	and
 the request should be reattempted later.

 EX_PROTOCOL (76)	   The remote system returned something	that was "not
 possible" during a protocol exchange.

 EX_NOPERM (77)	   You did not have sufficient permission to perform
 the operation.  This	is not intended	for file sys-
 tem problems, which should use EX_NOINPUT or
 EX_CANTCREAT, but rather for	higher level permis-
 sions.

 EX_CONFIG (78)	   Something was found in an unconfigured or miscon-
 figured state.

 The numerical values corresponding	to the symbolical ones are given in
 parenthesis for easy reference.

 SEE ALSO
 err(3), exit(3), style(9)

 HISTORY
 The sysexits file appeared	somewhere after	4.3BSD.

 AUTHORS
 This manual page was written by Jorg Wunsch after the comments in
 <sysexits.h>.

 STANDARDS (source: https://manpages.ubuntu.com/manpages/lunar/man3/sysexits.h.3head.html)
 Not in POSIX.1.  Present on the BSDs.  The <sysexits.h> file appeared in 4.0BSD for use by
 the deliverymail utility, later renamed to sendmail(8).
 */

public final class ExitException extends RuntimeException {

    public static final int OK = 0;
    public static final int SCRIPT_ERROR = 1;
    public static final int SCRIPT_ENGINE_ERROR = 63;

    @Getter
    private final int exitCode;

    public ExitException() {
        this(0);
    }

    public ExitException(final int exitCode) {
        super("Exiting script with code " + exitCode);
        this.exitCode = exitCode;
    }

    public ExitException(final int exitCode, Throwable throwable) {
        super("Exiting script with code " + exitCode, throwable);
        this.exitCode = exitCode;
    }
}
