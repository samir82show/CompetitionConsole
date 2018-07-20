#!/usr/bin/sh

echo "# CompetitionConsole" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/samir82show/CompetitionConsole.git
git push -u origin master
