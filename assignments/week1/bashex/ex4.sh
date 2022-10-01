#!/bin/bash
echo "Current directory""$PWD";
echo "Current user is:" `whoami`;
echo "Current date is:" `date`;
echo "Number of users logged in: "`who | cut -d " " -f 1 | sort -u | wc -l`
