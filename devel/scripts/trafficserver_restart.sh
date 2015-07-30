#!/usr/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack date synchronization script for Mac OS X.
#
######################################################################

echo "INFO: Stopping Apache Traffic Server..."
/usr/local/bin/trafficserver stop
sleep 1
echo "INFO: Starting Apache Traffic Server..."
/usr/local/bin/trafficserver start
echo "INFO: Done."
