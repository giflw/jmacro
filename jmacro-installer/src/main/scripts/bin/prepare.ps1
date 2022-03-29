param(
    [Parameter(Mandatory=$false)]
    [String]$repositoryBasePath='uri://repository/'
)

. ${PSScriptRoot}/commons.ps1

if (Test-Path -Path $distPath) {
    Remove-Item -Recurse -Path $distPath/*
}

Copy-Item -Recurse "${installerPath}/*" "${tmpPath}"

Write-Host "Preparing installer..."
New-Item -Path "${distPath}/installer/" -Type Directory | Write-Host
Copy-Item -Recurse "${installerPath}/*" "${distPath}/installer"
Invoke-Expression -Command @"
    ${tmpPath}/bin/jmacro-installer.bat prepare "${distPath}/installer/=${repositoryBasePath}/installer"
"@

Write-Host "Preparing jmacro..."
New-Item -Path "${distPath}/jmacro/" -Type Directory | Write-Host
Copy-Item -Recurse "${jmacroPath}/*" "${distPath}/jmacro"
Invoke-Expression -Command @"
    ${tmpPath}/bin/jmacro-installer.bat prepare "${distPath}/jmacro/=${repositoryBasePath}/jmacro"
"@

Write-Host "Removing tmp exec..."
Remove-Item -Path $tmpPath -Recurse
Write-Host "...done."
