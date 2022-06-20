SUMMARY = "track wallbox snapshot"
DESCRIPTION = "track snapshot revisions base on main version"
HOMEPAGE = "http://gitlab.rgm5.it/generic/wallbox_snapshots.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

PR="r1"

RDEPENDS_${PN} = "python3-pymysql nginx mariadb-server bash"

RDEPENDS_${PN} += "wilc-demo-fs-overlay (>=0.0.19-r15)"
RDEPENDS_${PN} += "serial2mqtt (>=1.0.25-r11)"
RDEPENDS_${PN} += "python3-ptyprocess (>=0.6.0-r0)"
RDEPENDS_${PN} += "opkg (>=0.4.2-r3)"
RDEPENDS_${PN} += "init-ifupdown (>=1.0-r22)"
RDEPENDS_${PN} += "dkc-colonnina-image (>=1.1.22-r5)"
RDEPENDS_${PN} += "dhcp-server-config (>=4.4.2-r1)"

do_install_append_class-target () {
	install -d ${D}/etc
	echo "${PR}" > ${D}/etc/build_revision
}

