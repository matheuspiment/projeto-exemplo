# Java Maven-based project analyzed on SonarCloud using Travis

[![Build status](https://travis-ci.org/matheuspiment/sonar-test.svg?branch=master)](https://travis-ci.org/matheuspiment/sonar-test)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=com.github.matheuspiment:sonar-test)](https://sonarcloud.io/dashboard/index/com.github.matheuspiment:sonar-test)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/95ad44b707cf40b08bc1fd09ad73ba5f)](https://www.codacy.com/app/matheuspiment/sonar-test?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=matheuspiment/sonar-test&amp;utm_campaign=Badge_Grade)

#### This project is analysed on [SonarCloud](https://sonarcloud.io)!

It is very easy to run an analysis on a Maven-based project and push it to SonarCloud.
You simply have to do 2 things in your `.travis.yml` file:
* Activate the [Travis Add-on](https://docs.travis-ci.com/user/sonarqube/)
* Run `mvn sonar:sonar` at some point of time in the `script` section

You can take a look at the [.travis.yml file](https://github.com/matheuspiment/sonar-test/blob/master/.travis.yml)
of this project to see it in practice.
