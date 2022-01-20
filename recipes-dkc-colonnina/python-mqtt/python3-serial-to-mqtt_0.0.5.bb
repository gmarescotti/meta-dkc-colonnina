
SUMMARY = "serial to mqtt"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/serial-to-mqtt/serial-to-mqtt-0.0.5.tar.gz"
BB_STRICT_CHECKSUM = "0"

SRC_URI[sha256sum] = "4a61544e07746a3f40ecb91ff65cbeb11f9052a1d63654addecd610f17c632fc"

S = "${WORKDIR}/serial-to-mqtt-0.0.5"

DEPENDS += " "

pkg_preinst_${PN}() {
   /etc/init.d/mqttservice stop
}

pkg_postinst_${PN}() {
   /etc/init.d/mqttservice start
}

