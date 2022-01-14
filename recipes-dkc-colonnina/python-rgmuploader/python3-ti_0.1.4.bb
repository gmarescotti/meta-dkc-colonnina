
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ti/ti-0.1.4.tar.gz"
SRC_URI[md5sum] = "3dd5bce4a02de7bd01f591919ace906a"
SRC_URI[sha256sum] = "ee4ecdae8b2fb621aee4afe6e4d90b3d9bf6e13970abd00f8d58a4bdf5304849"

S = "${WORKDIR}/ti-0.1.4"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

