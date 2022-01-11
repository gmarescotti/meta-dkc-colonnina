
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ti/ti-0.1.2.tar.gz"
SRC_URI[md5sum] = "5e2a7635a2eb3c220dc4a45a9fdfa2d7"
SRC_URI[sha256sum] = "165d3ba3e68331251d0b9f53b280e554f3781e362d836e8393484d9cd506e979"

S = "${WORKDIR}/ti-0.1.2"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

