
SUMMARY = "fstool"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/fstool/fstool-0.1.9.tar.gz"
SRC_URI[md5sum] = "a7c0ba8ef4d5dc82156cb30acc0e6307"
SRC_URI[sha256sum] = "0578f3c8c05271885a1eeb5618ecb88102abeeda2f98eea6c17b41910dc93551"

S = "${WORKDIR}/fstool-0.1.9"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

