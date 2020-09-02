# CMPSC 101 Participation

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the class participation programming activities for Computer Science 101.
All of the work that you do in class  will count towards your class participation grade.

## Commands

In this class students will use Gradle and GatorGrader tools to help check and complete assignments. Gradle is a build automation tool that compiles (builds) and runs programs for you so that you do not have to enter multiple commands. Additionally, it can perform extra checks, for example ensuring that your program satisfies the styling guidelines.
GatorGrader is an automated grading tool developed by Allegheny computer science students under the direction of Dr. Kapfhammer. It relies on Gradle and can be used to check the correctness of the assignment completion before submitting it. GatorGrader will be used for all lab and practical assignments but not for the class activities.

### Using Gradle via Docker

If you are using Docker Desktop you will run a `docker run` command to execute and test your programs.
First, navigate to your "class_activities" directory.
To ensure that the `docker run` command will work correctly, you
should create the cache directory by running the command `mkdir
$HOME/.dockagator`.
To enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container, enter the following
`docker run` command into your terminal.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

This command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment.

Now you can type `gradle build` to compile your class program and `gradle run` or `gradle -q --console plain run` to execute it.


## Updates

When the course instructor provides the new material for the in-class activity,
 you can type this command in the main directory for this repository:

```
git remote add download https://github.com/allegheny-computer-science-101-f2020/class_activities.git
```

You should only need to type this command once; typing the command additional
times may yield an error message but will not negatively influence the state of
your repository. Now, you are ready to download the updates provided by the
course instructor by typing:

```
git pull download master
```

This second command can be run whenever the course instructor needs to provide
you with new source code for this assignment. However, please note that, if you
have edited the files that the course instructor updated, running the previous
command may lead to Git merge conflicts. If this happens, you may need to
manually resolve them with the help of the instructor or a teaching assistant.


## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a technical leader . Alternatively, you may ask questions in the Slack workspace for this
course. 