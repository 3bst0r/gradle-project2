Continous Integration
=====================

Continous Integration is all about making changes and additions to a software project public (to the development team) as often as possible. The article "Continous Integration" on http://www.thoughtworks.com/continuous-integration states that committing work in progress atleast once daily to a universal repository is the best practice.
This means that there has to be some repository that is accessable for all the people working on a project. Moreover, there has to be an automated build mechanism in the repository. 

Fixing Bugs
-----------
There are countless advantages to this system. One of the most important one is not letting bugs and errors grow further than one day's work.
If developers do not post their progress often enough, bugs can be very difficult to track down after some time. However, when their changes in the application are summarized at least daily, not so many code has to be looked at in order to do sensible bugfixing.

Preventing misunderstandings
----------------------------
Further, the risk of creating misunderstandings in the strategy of the development of the product is reduced greatly. Every contributor to a project has to very often
pull the changes from the repository and therefore is always up-to-date on the current progress and the direction the project is heading to. It can happen that some
co-worker is mistakenly not inaugurated into an upcoming change in the developement of the piece of software. If he/she has to always look at the work his colleagues made, he/she will soon realize that there is something going on he does not know about yet.

Continous integration is less costly
------------------------------------
A common misconception is that continous integration is costly, because always having to push work minimizes the time used for actual developing and coding.
However, as already mentioned, not continously integrating is more costly as soon as not everything is working out as planned. Finding and fixing errors and bugs is then becoming a pain in the ass and can cause a project to be prolonged unnecessarily.

What's to consider
------------------
* building has to be automated and testing has to be a part of the building process.
as soon as anything is committed, it must be tested by pre-built unit tests.
* developers fetch their code from a central repository and commit their work daily to said repository
* bugs and problems have to be treated by the team or an individual at the earliest possible opportunity to not let them grow into the project 


