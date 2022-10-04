#!/bin/bash

# MICROCHIP=dkc$(cat /sys/class/net/eth0/address | awk -F: '{print $1$2$3}')
# assert $MICROCHIP == 04:91:62:41:ae:6a

HOSTNAME=dkc-$(cat /sys/class/net/eth0/address | awk -F: '{print $4$5$6}')

# persistent change
sed -i "s/127.0.1.1.*$CURRENT_HOSTNAME/127.0.1.1\t$HOSTNAME/g" /etc/hosts
echo $HOSTNAME > /etc/hostname

# runtime change
hostname $HOSTNAME
/etc/init.d/avahi-daemon restart

