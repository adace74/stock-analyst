#!/bin/bash
######################################################################
#
# $Id: startup.sh 223 2014-11-04 21:58:07Z adace $
#
# Description: Quick-hack startup script for Mac OS X.
#
######################################################################

echo "INFO: Attaching Google Chrome Cache..."
hdiutil attach /Users/adace/Devel/Chrome_Cache.dmg
echo "INFO: Starting SSH..."
sudo /usr/local/sbin/sshd		# Start SSH
echo "INFO: Starting vnstatd..."
sudo /usr/local/sbin/vnstatd -d         # Start vnstatd

echo "INFO: Done."
