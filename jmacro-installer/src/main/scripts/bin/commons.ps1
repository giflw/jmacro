$tmpName = "jmacro-$([guid]::NewGuid() )"
$tmpPath = "${env:TEMP}/${tmpName}".replace('\', '/')
Write-Host "EXEC TMP PATH: $(New-Item -Name "${tmpName}" -Path "${env:TEMP}" -Type Directory)"

$jmacroPath = "$((Split-Path -Path $PSScriptRoot -Parent).Replace('\', '/'))"

$jmacroPath = "${jmacroPath}".Replace('\', '/')
Write-Host "JMACRO PATH: ${jmacroPath}"

