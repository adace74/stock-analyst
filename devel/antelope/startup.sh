#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for Linux.
#
######################################################################

echo "INFO: Setting ifconfig txqueuelen..."
sudo ifconfig eth0 txqueuelen 2048

echo "INFO: Starting Squid..."
sudo /usr/local/squid/sbin/squid

echo "INFO: Done."
