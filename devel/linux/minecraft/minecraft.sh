#!/bin/bash
######################################################################
#
# $Id$
#
# Description: Quick-hack startup script for Linux.
#
######################################################################

echo "INFO: Starting Minecraft v1.8 server..."
# Launch java.
java -Xmx768M -Xms768M -jar minecraft_server.jar nogui < /dev/null >> minecraft.out 2>&1 &
#nice -n 5 java -Xmx512M -Xms512M -jar minecraft_server.jar nogui < /dev/null >> minecraft.out 2>&1 &
# Write PID file.
sleep 1
pidof java > minecraft.pid
echo "INFO: Done."