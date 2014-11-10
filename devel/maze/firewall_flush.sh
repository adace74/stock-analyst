#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for Linux.
#
######################################################################

echo "INFO: Dropping firewall rules..."
sudo iptables -F
sudo ip6tables -F

echo "INFO: Done."
