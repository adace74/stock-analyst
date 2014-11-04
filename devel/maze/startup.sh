#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for Linux.
#
######################################################################

echo "INFO: Activating custom resolv.conf..."
sudo cp /etc/resolv.conf.custom /etc/resolv.conf
#echo "INFO: Activating custom ethernet MTU..."
#sudo ifconfig eth0 mtu 9000 up
echo "INFO: Dropping firewall rules..."
sudo iptables -F
sudo ip6tables -F
echo "INFO: Starting vnstatd..."
sudo /usr/sbin/vnstatd -d			# Start vnstatd
echo "INFO: Starting Apache HTTPd..."
sudo /usr/local/apache2/bin/apachectl start	# Start HTTPd
echo "INFO: Starting Apache Traffic Server..."
sudo /usr/local/bin/trafficserver start		# Start ATS

echo "INFO: Done."
