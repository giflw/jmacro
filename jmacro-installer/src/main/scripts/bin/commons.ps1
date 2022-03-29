$tmpName = "jmacro-$([guid]::NewGuid() )"
$tmpPath = "${env:TEMP}/${tmpName}".replace('\', '/')
Write-Host "EXEC TMP PATH: $(New-Item -Name "${tmpName}" -Path "${env:TEMP}" -Type Directory)"

$jmacroPath = "$((Split-Path -Path $PSScriptRoot -Parent).Replace('\', '/'))"

$installerPath = "${jmacroPath}/installer"
if (!(Test-Path -Path $installerPath)) {
    $installerPath = "${jmacroPath}"
}
$installerPath = "${installerPath}".Replace('\', '/')
Write-Host "INSTALLER PATH: ${installerPath}"

if ($installerPath -eq $jmacroPath) {
    # target
    $jmacroPath = (Split-Path -Path $jmacroPath -Parent)
    # jmacro-installer
    $jmacroPath = (Split-Path -Path $jmacroPath -Parent)
    # jmacro
    $jmacroPath = (Split-Path -Path $jmacroPath -Parent)
    $jmacroPath = "${jmacroPath}/jmacro-cli/target/appassembler"
}
$jmacroPath = "${jmacroPath}".Replace('\', '/')
Write-Host "JMACRO PATH: ${jmacroPath}"

$distPath = "$(Split-Path -Path $installerPath -Parent)/dist".Replace('\', '/')
Write-Host "DIST PATH: ${distPath}"
