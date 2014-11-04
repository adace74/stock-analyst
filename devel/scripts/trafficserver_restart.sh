#!/bin/bash
######################################################################
#
# $Id: startup.sh 111 2013-10-15 20:44:21Z adace $
#
# Description: Quick-hack date synchronization script for Mac OS X.
#
######################################################################

echo "INFO: Stopping Apache Traffic Server..."
/usr/local/bin/trafficserver stop
/bin/sleep 1
/bin/ls -l /usr/local/var/trafficserver/ &> /dev/null
echo "INFO: Starting Apache Traffic Server..."
/usr/local/bin/trafficserver start
echo "INFO: Done."
