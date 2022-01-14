
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.12.tar.gz"
SRC_URI[md5sum] = "286ad069ad7cde0f9749acd952657974"
SRC_URI[sha256sum] = "6c391f926f4085cea81fa94c6668aea98030166bd59fe276b119e20bc750e8bf"

S = "${WORKDIR}/rgmuploader-0.1.12"

RDEPENDS_${PN} += " python3-singleton-decorator"

