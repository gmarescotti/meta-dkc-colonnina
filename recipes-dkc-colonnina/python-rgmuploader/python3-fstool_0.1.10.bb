
SUMMARY = "fstool"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/fstool/fstool-0.1.10.tar.gz"

SRC_URI[sha256sum] = "69ccd16185a1bd7c4120d627150c5d95f6330a62379051ce525019e0d882e3b2"

S = "${WORKDIR}/fstool-0.1.10"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

