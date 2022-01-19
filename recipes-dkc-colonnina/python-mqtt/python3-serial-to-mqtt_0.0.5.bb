
SUMMARY = "serial to mqtt"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/serial-to-mqtt/serial-to-mqtt-0.0.5.tar.gz"
BB_STRICT_CHECKSUM = "0"

# SRC_URI[md5sum] = "7f2a421954cb8fe718925dd55b3f6b91"
# SRC_URI[sha256sum] = "d368508fffdf95da5cdccded38c94ee9da2154787a5833ce2e0d14a646c9b462"

S = "${WORKDIR}/serial-to-mqtt-0.0.5"

DEPENDS += " "

pkg_preinst_${PN}() {
   /etc/init.d/mqttservice stop
}

pkg_postinst_${PN}() {
   /etc/init.d/mqttservice start
}

