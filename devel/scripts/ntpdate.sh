#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack date synchronization script for Mac OS X.
#
######################################################################

echo "INFO: Starting ntpdate..."
/usr/sbin/ntpdate clock.he.net
echo "INFO: Done."
