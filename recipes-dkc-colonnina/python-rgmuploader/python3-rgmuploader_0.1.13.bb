
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.13.tar.gz"
SRC_URI[sha256sum] = "382da606403d140bd8c6b832ebce885e8824170ce2d71320183579c096a2d1bc"

S = "${WORKDIR}/rgmuploader-0.1.13"

RDEPENDS_${PN} += " python3-singleton-decorator"

