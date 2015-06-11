#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for FreeBSD.
#
######################################################################

echo "INFO: Activating custom swapfile..."
sudo mdconfig -a -t vnode -f /swapfile -u 0
sudo swapon /dev/md0
echo "INFO: Starting vnstatd..."
sudo /usr/local/sbin/vnstatd -d			# Start vnstatd
echo "INFO: Starting Apache Traffic Server..."
sudo /usr/local/bin/trafficserver start		# Start ATS

echo "INFO: Done."
