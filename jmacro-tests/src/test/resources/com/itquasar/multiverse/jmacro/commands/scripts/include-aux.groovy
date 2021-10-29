/*
START METADATA
name: INCLUDE AUX
END METADATA
 */

echo "This is include aux script"

// Note we are not using def or type.
// In this way the variable goes to context binding allowing use in the including script
INCLUDED_PROP = "foo"

def included_func(def arg) {
    return "included: " + arg
}



