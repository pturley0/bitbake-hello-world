BitBake "Hello, World!" Project
===============================


This is nearly the smallest, valid BitBake project that prints "Hello, World!" This is useful
because:

1. It can serve as a simple basis from which to test and explore basic BitBake features.<br><br>

2. It reveals what is fundamental to BitBake itself, apart from the superstructure that
OpenEmbedded, Yocto, _et. al._ put on top of it.

This project has been tested against BitBake 1.15.2, which is what Yocto "denzil" uses. Here's the
output:

<br>

    $ ../BitBake/bin/bitbake  a
    Parsing recipes: 100% |########################################################| Time: 00:00:00
    Parsing of 1 .bb files complete (0 cached, 1 parsed). 1 targets, 0 skipped, 0 masked, 0 errors.
    NOTE: Resolving any missing task queue dependencies
    NOTE: Preparing runqueue
    NOTE: Executing RunQueue Tasks
    NOTE: Running task 1 of 1 (ID: 0, /home/pturley/Workspace/Hello/LayerA/a.bb, do_build)
    NOTE: package None: task do_build: Started
    Hello, World!
    NOTE: package None: task do_build: Succeeded
    NOTE: Tasks Summary: Attempted 1 tasks of which 0 didn't need to be rerun and all succeeded.

<br>

Some things to note:

1. This is not the _smallest_ such BitBake project. For example, the `DESCRIPTION` and `PV`
variables need not be assigned in `a.bb`. I set those variables because I wanted `show-layers` and
`show-recipes` to display reasonable information.<br><br>

2. Some of the variables set in `bitbake.conf` have "simplified" values. For example, you would
_not_ want to use these values if there were multiple recipes and you had to disambiguate the output
from each of them.<br><br>

3. On the other hand, _all_ the variable assignments in `bitbake.conf` are _essential_ to BitBake
itself. If you remove any one of those assignments, BitBake will either declare an error or die
(usually because some internal variable is set to `None` and the BitBake code can't handle it).
