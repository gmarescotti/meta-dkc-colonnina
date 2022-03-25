
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.15.tar.gz"
SRC_URI[sha256sum] = "4d38ee75ae9eccdd2ec0c2ac95dff13e17ccc0d70a0326ccb4147b9df87fc59b"

S = "${WORKDIR}/rgmuploader-0.1.15"

RDEPENDS_${PN} += " python3-singleton-decorator"

