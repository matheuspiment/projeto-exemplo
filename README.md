# Java Maven-based project analyzed on SonarCloud using Travis

[![Build status](https://travis-ci.org/matheuspiment/sonar-test.svg?branch=master)](https://travis-ci.org/matheuspiment/sonar-test)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=com.github.matheuspiment:projeto-exemplo)](https://sonarcloud.io/dashboard/index/com.github.matheuspiment:projeto-exemplo)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/5025d66bade34f5ab686d7c3521f35f2)](https://www.codacy.com/app/matheuspiment/projeto-exemplo?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=matheuspiment/projeto-exemplo&amp;utm_campaign=Badge_Grade)
[![Code Climate](https://codeclimate.com/github/matheuspiment/projeto-exemplo/badges/gpa.svg)](https://codeclimate.com/github/matheuspiment/projeto-exemplo)

#### This project is analysed on [SonarCloud](https://sonarcloud.io)!

It is very easy to run an analysis on a Maven-based project and push it to SonarCloud.
You simply have to do 2 things in your `.travis.yml` file:
* Activate the [Travis Add-on](https://docs.travis-ci.com/user/sonarqube/)
* Run `mvn sonar:sonar` at some point of time in the `script` section

You can take a look at the [.travis.yml file](https://github.com/matheuspiment/sonar-test/blob/master/.travis.yml)
of this project to see it in practice.
