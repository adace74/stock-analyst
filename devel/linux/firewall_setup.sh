#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for Linux.
#
######################################################################

echo "INFO: Setting up firewall rules..."
# Apache HTTP Server
#sudo firewall-cmd --zone=public --add-port=80/tcp --permanent
# Apache TrafficServer
sudo firewall-cmd --zone=public --add-port=8080/tcp --permanent
# Minecraft
#sudo firewall-cmd --zone=public --add-port=25565/tcp --permanent
#sudo firewall-cmd --reload
echo "INFO: Done."
