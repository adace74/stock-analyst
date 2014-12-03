#!/bin/sh
######################################################################
#
# $Id$
#
# (c) Copyright 2013 Adam W. Dace.  All Rights Reserved. 
# Please see the accompanying COPYING file for license information.
#
# Description:  Creates distribution tar/bzip2 archives.
#
######################################################################
#
# Variables.
#
SVNWORK_DIR="/Users/adace/Devel/svnwork/ddashboard/trunk/"
RELEASES_DIR="/Users/adace/Devel/releases/"
RELEASE_NAME="desktop-dashboard-0.1"

cd $SVNWORK_DIR
mkdir $RELEASES_DIR/tmp
tar --create -z --file $RELEASES_DIR/tmp/$RELEASE_NAME.tar.gz *
cd $RELEASES_DIR/tmp
mkdir $RELEASE_NAME
cd $RELEASE_NAME
tar --extract --file ../$RELEASE_NAME.tar.gz
cd ..
tar --create -j --file $RELEASE_NAME.tar.gz $RELEASE_NAME
mv $RELEASE_NAME.tar.gz ..
rm -rf $RELEASE_NAME
cd ..
rmdir $RELEASES_DIR/tmp
