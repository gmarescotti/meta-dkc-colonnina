
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=b334fc90d45983db318f54fd5bf6c90b"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.10.tar.gz"
SRC_URI[md5sum] = "60b53ade4b2b470775f6a6c19a66400a"
SRC_URI[sha256sum] = "6444c2b42e82354fbbc34828fa39975a406a4bf540d5d36aeb976fa19dea3880"

S = "${WORKDIR}/rgmuploader-0.1.10"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

