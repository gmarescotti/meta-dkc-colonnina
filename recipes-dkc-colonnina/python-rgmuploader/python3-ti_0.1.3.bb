
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ti/ti-0.1.3.tar.gz"
SRC_URI[md5sum] = "13177db7ee35d36795302089e02d60b1"
SRC_URI[sha256sum] = "f934b6bae4b088e0ce315846f6c3ec0eb781f01c013f54a8308bb8a2c4abdff2"

S = "${WORKDIR}/ti-0.1.3"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

