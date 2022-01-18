
SUMMARY = "serial to mqtt"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/serial-to-mqtt/serial-to-mqtt-0.0.2.tar.gz"
SRC_URI[md5sum] = "4f1c0520b34440b755dec0b816968260"
SRC_URI[sha256sum] = "88767adbd493fd38a3f9556f88c152777f402f33e3ffd005615acdd346b61cdc"

S = "${WORKDIR}/serial-to-mqtt-0.0.2"

DEPENDS += " "

