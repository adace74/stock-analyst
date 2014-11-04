#!/bin/bash
######################################################################
#
# $Id: startup.sh 111 2013-10-15 20:44:21Z adace $
#
# Description: Quick-hack date synchronization script for Mac OS X.
#
######################################################################

echo "INFO: Starting ntpdate..."
/usr/sbin/ntpdate clock.he.net
echo "INFO: Done."
