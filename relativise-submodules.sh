#!/bin/bash

baseUrl=`git remote get-url origin`
echo "JMacro Git URL: ${baseUrl}"
baseUrl=${baseUrl%*jmacro.git}
echo "Base Git URL: ${baseUrl}"

echo 'Submodules repositories:'
for submodule in `git submodule status | awk '{print $2}' `; do
    subName=${submodule#git-modules/*}
    echo '=========================================='
    echo "${subName} (path: ${submodule})"
    subRepoUrl=${baseUrl}${subName}.git
    cmd="git submodule set-url $submodule $subRepoUrl"
    $cmd
done

echo '=========================================='
echo 'Done!'