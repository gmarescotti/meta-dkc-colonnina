
SUMMARY = "CAN ISO TP "
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/can-isotp/can-isotp-1.5.1.tar.gz"
SRC_URI[md5sum] = "7bc66e6968c783d5f320988412979703"
SRC_URI[sha256sum] = "6474ca7b82ef2f5fc5b81f025a6694425663f53eab0fba0b4f97558e736cf44e"

S = "${WORKDIR}/can-isotp-1.5.1"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

