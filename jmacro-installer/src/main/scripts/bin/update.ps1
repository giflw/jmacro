param(
    [Parameter(Mandatory=$true)]
    [String]$repositoryBaseUri
)

. ${PSScriptRoot}/commons.ps1

Copy-Item -Recurse "${installerPath}/*" "${tmpPath}"

Write-Host "Updating jmacro..."
Invoke-Expression -Command @"
    ${tmpPath}/bin/jmacro-installer.bat update "${repositoryBaseUri}/jmacro/=${jmacroPath}"
"@

Write-Host "Removing tmp exec..."
Remove-Item -Path $tmpPath -Recurse
Write-Host "...done."

