
SUMMARY = "Udsoncan "
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/udsoncan/udsoncan-1.8.tar.gz"
SRC_URI[sha256sum] = "6bb07045a2ce36cbc72619b5cf62d169d34d517703be63efe9bf5f17dffb24ff"

S = "${WORKDIR}/udsoncan-1.8"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

