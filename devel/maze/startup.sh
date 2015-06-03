#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for Mac OS X.
#
######################################################################

echo "INFO: Starting vnstatd..."
sudo /usr/local/sbin/vnstatd -d         # Start vnstatd

echo "INFO: Done."
