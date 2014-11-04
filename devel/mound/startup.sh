#!/bin/bash
######################################################################
#
# $Id$
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
