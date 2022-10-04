SUMMARY = "track wallbox snapshot"
DESCRIPTION = "track snapshot revisions base on main version"
HOMEPAGE = "http://gitlab.rgm5.it/generic/wallbox_snapshots.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

PR="r5"

RDEPENDS_${PN} = "python3-pymysql nginx mariadb-server bash"

include snapshot_rdepends.inc snapshot_rdepends_rel.inc

do_install_append_class-target () {
	install -d ${D}/etc
	echo "${PR}" > ${D}/etc/build_revision
}

pkg_postinst_ontarget_${PN}() {
	# Solve old bug where serial2mqtt could not restart itself
	# read previous version works because snapshot is installed after serial2mqtt
	# if grep -q 0.0.3 "/etc/build"; then  
	#       # release 0.0.3
	#       REV=10 # default high revision as "x" => no action
	#       if [ -f /etc/build_revision ]; then
	#               REV=$(cat /etc/build_revision)
	#               REV=${REV:1:100} # remove r from revision (i.e. r4 => 4)
	#               echo "current release is RELEASE 0.0.3-r$REV" >> /var/log/bugfix_upgrade003.log
	#               if (( REV < 5 )); then  
	#                       echo RELEASE 0.0.3-r$REV needs manual restart >> /var/log/bugfix_upgrade003.log
	#                       /etc/init.d/mqttservice restart >> /var/log/bugfix_upgrade003.log
	# 		      opkg install serial2mqtt >> /var/log/bugfix_upgrade003.log
	# 		      # reboot
	#               fi
	#       fi
	# fi
	# DA TOGLIERE AL SUCCESSIVO R6
	/etc/init.d/mqttservice restart >> /var/log/bugfix_upgrade003.log
	# opkg install serial2mqtt >> /var/log/bugfix_upgrade003.log
}

