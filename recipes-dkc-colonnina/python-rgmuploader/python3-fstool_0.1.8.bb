
SUMMARY = "fstool"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/fstool/fstool-0.1.8.tar.gz"
SRC_URI[md5sum] = "ef86fa962064da1471d4283cbe22c209"
SRC_URI[sha256sum] = "f5a2d9e6977e7290576d9a226973b25c12423b8050bb1626ee218ab1bf6d3f73"

S = "${WORKDIR}/fstool-0.1.8"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

