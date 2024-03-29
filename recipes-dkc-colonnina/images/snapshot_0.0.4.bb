SUMMARY = "track wallbox snapshot"
DESCRIPTION = "track snapshot revisions base on main version"
HOMEPAGE = "http://gitlab.rgm5.it/generic/wallbox_snapshots.git"
AUTHOR = "Filippo Montano <filippo.montano@rgm.it>"
LICENSE = "CLOSED"

PR="r4"

RDEPENDS_${PN} = "python3-pymysql nginx bash"

include snapshot_rdepends.inc snapshot_rdepends_rel.inc

do_install_append_class-target () {
	install -d ${D}/etc
	echo "${PR}" > ${D}/etc/build_revision
}

pkg_postinst_ontarget_${PN}() {
        # (sleep 6; opkg install serial2mqtt >> /var/log/bugfix_upgrade004.log 2>&1 ) &
}

