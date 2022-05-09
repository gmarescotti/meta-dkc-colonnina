
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.16.tar.gz"
SRC_URI[sha256sum] = "b092a2741248846b177653260fdc6d8352e8636ae1a33a35221c2e00b1d520bf"

S = "${WORKDIR}/rgmuploader-0.1.16"

RDEPENDS_${PN} += " python3-singleton-decorator"

