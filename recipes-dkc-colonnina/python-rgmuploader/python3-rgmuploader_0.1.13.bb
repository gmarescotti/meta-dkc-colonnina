
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.13.tar.gz"
SRC_URI[md5sum] = "235d36c896312925badc803e880c4a28"
SRC_URI[sha256sum] = "6155af1eb7f38ceff52c7f2ddde4e5de4e16c61823dd165bd3f2b345aeb75528"

S = "${WORKDIR}/rgmuploader-0.1.13"

RDEPENDS_${PN} += " python3-singleton-decorator"

