
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.14.tar.gz"
SRC_URI[sha256sum] = "8f39dc1573c21ac1fbe0cf90302bbbc8a77a883f8f694d3e629e3705d319892b"

S = "${WORKDIR}/rgmuploader-0.1.14"

RDEPENDS_${PN} += " python3-singleton-decorator"

