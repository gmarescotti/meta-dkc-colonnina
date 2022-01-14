
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.11.tar.gz"
SRC_URI[md5sum] = "f131c574b4aa74d993bb93ad99febe99"
SRC_URI[sha256sum] = "cfbb98a7f75a2cc0efbd605287ec5bc13059a2202ad65ef17e75026a8bb5a33f"

S = "${WORKDIR}/rgmuploader-0.1.11"

DEPENDS += " "


