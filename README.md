# Project
Design a simple test framework and a series of test scenarios that cover this requirement using BDD

“As a User I want to go to Weather.com website and search for the weather forecast in a few cities.”

# Technologies
Gradle - an open-source build-automation system.

Cucumber - a tool based on Behavior Driven Development (BDD) framework which is used to write acceptance tests for the web application. It allows automation of functional validation in easily readable and understandable format (like plain English) to Business Analysts, Developers, Testers, etc.

Serenity BDD - an open source library, strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach, and the more sophisticated and flexible Screenplay pattern. And one more advantage is producing illustrated, narrative reports that document and describe what your application does and how it works

# Approaches&Paradigms
BDD - the main advantage to BDD test cases being written in a common language is that details of how the application behaves can be easily understood by all.

#Layers&Logic patterns
1. pages
2. steps
3. steps definitions
4. feature file
5. runner

#P.S.
For run project use file build.gradle. Test scripts you can find i Report will be save in target/site/serenity/index.htmln features/weather.feature.