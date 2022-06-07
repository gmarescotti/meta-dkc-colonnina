SUMMARY = "CStruct modified by RGM"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/cstruct/cstruct-1.10.tar.gz"
SRC_URI[sha256sum] = "4a3a5e1394e597a60b268491f5343719a8cfec6b8bde892146a81823e98670ac"

S = "${WORKDIR}/cstruct-1.10"

