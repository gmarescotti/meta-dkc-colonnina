SUMMARY = "track wallbox snapshot"
DESCRIPTION = "track snapshot revisions base on main version"
HOMEPAGE = "http://gitlab.rgm5.it/generic/wallbox_snapshots.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

PR="r2"

RDEPENDS_${PN} = "python3-pymysql nginx mariadb-server bash"

RDEPENDS_${PN} += "serial2mqtt (>=1.0.25-r20)"
RDEPENDS_${PN} += "dkc-colonnina-image (>=1.1.22-r8)"
RDEPENDS_${PN} += "wilc-demo-fs-overlay (>=0.0.19-r16)"

RDEPENDS_${PN} += "opkg (>=0.4.2-r3)"
RDEPENDS_${PN} += "python3-ptyprocess (>=0.6.0-r0)"
RDEPENDS_${PN} += "init-ifupdown (>=1.0-r22)"
RDEPENDS_${PN} += "dhcp-server-config (>=4.4.2-r1)"

RDEPENDS_${PN} += "ifplugd (>=0.28-r5)"
RDEPENDS_${PN} += "ntp-tickadj (>=4.2.8p15-r0)"
RDEPENDS_${PN} += "ntp-utils (>=4.2.8p15-r0)"
RDEPENDS_${PN} += "ntp (>=4.2.8p15-r0)"
RDEPENDS_${PN} += "ntpdate (>=4.2.8p15-r0)"
RDEPENDS_${PN} += "ntpdc (>=4.2.8p15-r0)"
RDEPENDS_${PN} += "ntpq (>=4.2.8p15-r0)"
RDEPENDS_${PN} += "python3-anyio (>=3.6.1-r0)"
RDEPENDS_${PN} += "python3-asyncgpio (>=0.5.0-r0)"
RDEPENDS_${PN} += "python3-decorator (>=4.4.2-r0)"
RDEPENDS_${PN} += "python3-evdev (>=1.3.0-r0)"
RDEPENDS_${PN} += "python3-fstool (>=0.1.10-r0)"
RDEPENDS_${PN} += "python3-pbr (>=5.9.0-r0)"
RDEPENDS_${PN} += "python3-pexpect (>=4.8.0-r0)"
RDEPENDS_${PN} += "python3-rgmuploader (>=0.1.18-r0)"
RDEPENDS_${PN} += "python3-sniffio (>=1.2.0-r0)"
RDEPENDS_${PN} += "python3-sqlalchemy-migrate (>=0.13.0-r0)"
RDEPENDS_${PN} += "python3-sqlparse (>=0.3.1-r0)"
RDEPENDS_${PN} += "python3-tempita (>=0.5.2-r0)"
RDEPENDS_${PN} += "python3-watchdog (>=2.1.9-r0)"

do_install_append_class-target () {
	install -d ${D}/etc
	echo "${PR}" > ${D}/etc/build_revision
}

