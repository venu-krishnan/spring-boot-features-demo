#!/usr/bin/env bash

function go_to_project_dir() {
    local -r script_dir=$(dirname "${BASH_SOURCE[0]}")
    cd "$script_dir/../" || exit 1
}

function build(){
    ./gradlew clean build -x test -x check
}

function main(){
    go_to_project_dir
    source scripts/common.sh || exit 1

    common.set_bash_error_handling
    build
    common.display_success_message "spring-boot build completed successfully"
}

main
