
SUMMARY = "CAN ISO TP "
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/can-isotp/can-isotp-1.5.1.tar.gz"
SRC_URI[sha256sum] = "adae9eddbf5f8066c9cf9115ed98079ac79cceea7eeb633ab175fbce7d7ba0e6"

S = "${WORKDIR}/can-isotp-1.5.1"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

